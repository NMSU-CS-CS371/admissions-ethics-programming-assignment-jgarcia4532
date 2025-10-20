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
* Did you exclude any sensitive features? Why or why not?
* Should “legacy” still carry a positive weight?
* What other features (e.g., proximity, essay strength, disability) might you add or adjust?

### Fairness & Outcomes
* Between the blind and aware models, which applicants benefited or lost out?
* Which applicants specifically benefited from the aware model?
* Does adding income or first-generation status make the system fairer or less fair? Why?
* Which model feels more fair overall, and why?

### Transparency & Accountability
* How transparent is your algorithm?
* Could you clearly explain a rejection to an applicant?
* Would you feel comfortable if this algorithm evaluated your application? Why or why not?

### Broader Implications
* What risks might arise if such an algorithm were used in real admissions?
* What real-world parallels exist (e.g., hiring, policing, scholarships)?
* What does this exercise reveal about fairness in algorithmic decision systems?
* Can algorithms ever be truly fair, or do they just shift where bias appears?
* How should fairness and accountability be balanced in automated decisions?
