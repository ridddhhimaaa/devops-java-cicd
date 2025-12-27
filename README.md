#### **Password Strength Analysis – Security Risk Scoring System**



**Project Overview**



This project is a Java-based Password Strength Checker integrated with Data Science and Machine Learning analysis, following DevOps best practices.



The system evaluates password strength using rule-based feature engineering, generates structured security data, performs exploratory data analysis and visualization using Python, and trains a machine learning model to classify password strength.  

GitHub version control, branching, and merging are used to manage development workflows.





**Objectives**



\- Build a password strength checker using \*\*Core Java and Maven\*\*

\- Evaluate passwords using \*\*feature-based scoring\*\*

\- Generate a structured dataset (`CSV`) for analysis

\- Perform \*\*data analysis, visualization, and ML modeling\*\* using Python

\- Demonstrate \*\*DevOps practices\*\* such as Git branching and merging

\- Maintain clean project structure and documentation





**Technologies Used**



Programming \& Build



\- Java (JDK)

\- Maven



**Data Science \& ML**



\- Python

\- Pandas

\- Matplotlib

\- Scikit-learn

\- Jupyter Notebook



**DevOps \& Tools**



\- Git \& GitHub

\- Command Line (Windows)

\- Git branching \& merging





**Project Structure**



password-checker/

│

├── analysis/

│ └── password\_analysis.ipynb # Data analysis, visualization \& ML

│

├── screenshots/

│ ├── maven\_build.png # Maven build execution

│ ├── cmd\_run.png # Java program execution

│ ├── jupyter\_dataframe.png # Dataset preview

│ └── jupyter\_graph.png # Visualization output

│

├── src/

│ └── main/

│ └── java/

│ └── com/example/

│ └── PasswordChecker.java

│

├── password\_data.csv # Generated dataset

├── pom.xml # Maven configuration

├── .gitignore # DevOps hygiene

└── README.md



**Java Application Logic**



The Java application:

1\. Accepts password input from the user

2\. Extracts password features:

&nbsp;  - Length

&nbsp;  - Uppercase characters

&nbsp;  - Digits

&nbsp;  - Special characters

3\. Assigns weighted scores to each feature

4\. Classifies password strength as:

&nbsp;  - Weak

&nbsp;  - Medium

&nbsp;  - Strong

5\. Stores results in a CSV file for analysis



**Feature-Based Scoring (Example)**



| Feature | Weight|

|-----------------|

| Length  =    30 |

| Uppercase =  15 |

| Lowercase =  15 |

| Digit =      20 |

| Special Character = 20 |



Command Line Execution



**Dataset Generation**



Each execution appends one row to `password\_data.csv`:

This dataset is used for further Data Science and ML analysis.





**Data Science \& Visualization**



The generated dataset is analyzed using \*\*Pandas\*\* and visualized using \*\*Matplotlib\*\*.





**Machine Learning Model**



\- Model Used:Decision Tree Classifier

\- Features:Length, uppercase, digit, special character, score

\- Target:Password strength category

\- Purpose:Predict password strength based on extracted features



This demonstrates how rule-based systems can be extended into \*\*predictive models\*\*.



**DevOps Practices Used**



\- Git version control

\- Separate branch for ML analysis (`ml-analysis`)

\- Merging ML branch into `main`

\- `.gitignore` to exclude build artifacts and checkpoints

\- Clean commit history



**Learning Outcomes**



\- Java + Maven project structuring

\- Feature engineering for security analysis

\- Dataset creation and preprocessing

\- Data visualization and ML modeling

\- GitHub branching and merging workflow

\- End-to-end integration of \*\*DevOps + Data Science\*\*





**Future Enhancements**



\- Add OWASP password policy rules

\- Improve ML model with larger datasets

\- Integrate Jenkins CI pipeline

\- Deploy as a REST API





**Author**



Riddhima Rai  

Engineering Student  

Domain: Data Science • DevOps • Machine Learning





**Conclusion**



This project demonstrates how a traditional Java application can be enhanced with Data Science and Machine Learning techniques while following modern DevOps practices, making it suitable for academic evaluation and real-world learning.









