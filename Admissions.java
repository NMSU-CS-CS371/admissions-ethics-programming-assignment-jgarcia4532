// Admissions.java
// Contains the scoring models (Blind vs Aware).

public class Admissions {

    // Blind model (only academic/performance factors)
    public static double blindScore(Applicant app) {
        double score = 0.0;

        // 0.4 -> 0.45
        score += (app.gpa / 4.0) * 0.45;     // GPA normalized
        // 0.3 -> 0.35
        score += (app.test / 1600.0) * 0.35;  // Test score normalized
        // 0.1 -> 0.15
        score += app.extra * 0.15;  // Extracurriculars
        // 0.1 -> 0.05
        score += app.essay * 0.05; // Essay quality
        // 0.1 -> 0.00
        score += app.rec * 0.00; // Recommendations
        
        return score; // final score between 0 and 1
    }

    // Aware model (adds equity and context)
    public static double awareScore(Applicant app) {
        double score = blindScore(app);

        // 0.05 -> 0.05
        if (app.income < 40000) score += 0.05;     // low-income boost
        // 0.05 -> 0.00
        if (app.firstGen) score += 0.00;           // first-generation bonus
        // 0.03 -> 0.03
        if (app.disability) score += 0.03;         // accessibility consideration
        // 0.02 -> 0.00
        if (app.legacy) score += 0.00;             // legacy advantage
        // 0.03 -> 0.00
        if (app.local) score += 0.00;              // local preference
        // 0.00 -> 0.02
        if (app.age < 18) score += 0.02;           // age consideration
        // 0.00 -> 0.00
        if (!app.ethnicity.equalsIgnoreCase("White")) score += 0.00; // diversity boost
        // 0.00 -> 0.10
        if (app.geography.equalsIgnoreCase("Toronto, Canada")) score += 0.10; // exotic area boost... go Canada!
        // 0.00 -> -1.00
        if (app.name.startsWith("Z")) score += -1.00; // name-based bias... absolutly no Z names
        
        return Math.min(score, 1.0);               // cap score at 1.0
    }
}