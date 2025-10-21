[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/oqKLEXJJ)
# 🎓 Ethical Admissions Algorithm Simulation

This repository is a classroom exercise exploring **ethics and fairness in algorithmic decision-making** — specifically in college admissions.

You’ll implement and reflect on how feature selection and weighting can impact fairness, transparency, and equity in automated systems.

---

## 🧩 Overview

You are part of the admissions committee for **Anonymous University**, located near Anonymous City.  
Due to a large number of applications, the committee decides to use an algorithm to help **rank and shortlist applicants**.

Your task:
- Decide which factors to include (GPA, test scores, extracurriculars, essays, recommendation letters, legacy status, income, etc.)
- Assign weights to each factor.
- Compare outcomes under two models:
  - **Blind model**: Ignores sensitive factors.
  - **Aware model**: Includes them intentionally to promote fairness (e.g., extra weight for first-gen or low-income applicants).

---

## ⚙️ How to Run

You can run the code on any online Java compiler (e.g. [Replit](https://replit.com/~) or [Programiz Java Compiler](https://www.programiz.com/java-programming/online-compiler))  
or locally via terminal:

```bash
javac Applicant.java Admissions.java Main.java
java Main
```

## Answers

After running both models, discuss and reflect on the following:

### Feature Selection & Design
* What variables did you include, and why?
- GPA: This seemed like a very good base for which to judge commitment and effort put forth.
- Test: This can serve as a notable determination of a students capabilties in an enclosed setting, like exams in countless courses.
- Extracurriculars: The extracurricular activities of a student can show ones ability to connect and be apart of something bigger. Related attributes such as teamwork from these extras can serve them well in college.
- Essay: Although quite low in the priority, writting does play an important part in college. Formating and effectively communicating information is essential
- Income: Getting a small bump in value toward low income students could be the break they need to really start excelling in a new environment away from their old one.
- Disability: Recieving a bit more of consideration for ones disability rather than being put down for it is helpful. It can also help bring in a more diverse background and persepectives.
- Age: Out of all of the aware score boosters, age is the smallest, but can still be just enough. Being younger it can be harder to show your full skill as you have not had the same time as everyone else to find your talents and practice as much. So a bit of a bump seems deserved.

* Did you exclude any sensitive features? Why or why not?
Most of these are along the same lines, but I beleive that no matter were you come from or who you are, you can grow into the person you want to be and should not be limited by things you cannot change. The only ones I did not exclude were income, disability, and age as perviously mentioned.
- First Generation: On the base of admission I think it should be more on other factors and ones such as first generation should play more into support with things such as scholarships.
- Legacy: I feel like this one was never good to begin with, not unless I am miss understanding it.
- Local: I do not feel like this one was very good either. Should one not seek greater diversity and new perspectives?
- Ethnicity: Standing on equal ground with everyone else dispite ethnicity in a academic setting seems like the right play.
- Geography: Favoring a particular location or place of origin does not seem fair as many times people do not get the choice to choose where they live before heading to college.
- Name: Definity not including this one for obvious reasons.
- Recommendation: I also excluded this even though its not sentive. I just thought it better used in a more professional setting and not academic.

* Should “legacy” still carry a positive weight?
In my opinion "legacy" should not be considered or weighted in at all. 

* What other features (e.g., proximity, essay strength, disability) might you add or adjust?
Having added/adjusted all features included in the data I will summarize it to say that I put more into the values under blind scoring and less into the aware score.

### Fairness & Outcomes
* Between the blind and aware models, which applicants benefited or lost out?
Interestingly enough between the two models that I modifided, there is no difference between admissions. This is because I mostly prioritized the blind model with few benefiting from the aware to a notable degree.

* Which applicants specifically benefited from the aware model?
None did based off of the test, but there are slight bumps to those with low income, disability, and a young age.

* Does adding income or first-generation status make the system fairer or less fair? Why?
I feel like adding income and first generation status to the system slightly messes with the fairness of the system as they are not really things people can help change in a lot of situations.

* Which model feels more fair overall, and why?
I like the blind model for fairness as it evaluates you and your capabilities, not who you are or where you came from.

### Transparency & Accountability
* How transparent is your algorithm?
The algorithm in use is transparent with favoring the blind model for those that show promising GPAs and test results.

* Could you clearly explain a rejection to an applicant?
Most likely, yes. If they do not have high enough results they are not accepeted.

* Would you feel comfortable if this algorithm evaluated your application? Why or why not?
I do not see why not. I may not get in, but to those who do, it is fairly based on their efforts they put forth in school. 

### Broader Implications
* What risks might arise if such an algorithm were used in real admissions?
The number of admissions would be significantly lower as compared to some other algorithms. This runs the risk of under shooting admission goals and potentially causing completely capable students that may have struggled in high school with being rejected.

* What real-world parallels exist (e.g., hiring, policing, scholarships)?
I am not entirely sure, but probably higher end colleges.

* What does this exercise reveal about fairness in algorithmic decision systems?
This exercise speaks to fairness in algorithmic decisions as it provides important insights to its impacts on crucial systems. Trying to make a "fair" algorithm is not easy and heavily subject to developer bias.

* Can algorithms ever be truly fair, or do they just shift where bias appears?
No algorithms can never be truely fair and will always some what be influenced by bias. In some cases they might be considered to be fair to one person or in one situation, but never univserally. This is because what we consider "fair" differs from person to person and even situation to situation.

* How should fairness and accountability be balanced in automated decisions?
Fairness and accountability should be balanced based off of the system that is in need of automated decisions. In some cases fairness should be prioritized and others accountability. Overall I look more toward fairness as I feel like if everyone has a high level of commitment, accountability results should hopefully level. Although in a real system a bit more tweeking is needed.
