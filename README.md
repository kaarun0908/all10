# All 10 Java Practical Programs - Maven & Jenkins Project

This repository contains 10 foundational Java laboratory examination programs packaged into a single Apache Maven project with JUnit 5 test suites and a Jenkins Declarative CI/CD Pipeline.

---

## Program Index

| # | Program Description | Source Code | Test Code |
|---|---------------------|-------------|-----------|
| 1 | Generate Fibonacci Series | [`src/main/java/com/example/Fibonacci.java`](src/main/java/com/example/Fibonacci.java) | [`src/test/java/com/example/FibonacciTest.java`](src/test/java/com/example/FibonacciTest.java) |
| 2 | Reverse a Number | [`src/main/java/com/example/ReverseNumber.java`](src/main/java/com/example/ReverseNumber.java) | [`src/test/java/com/example/ReverseNumberTest.java`](src/test/java/com/example/ReverseNumberTest.java) |
| 3 | Check Whether a Number is Palindrome | [`src/main/java/com/example/NumberPalindrome.java`](src/main/java/com/example/NumberPalindrome.java) | [`src/test/java/com/example/NumberPalindromeTest.java`](src/test/java/com/example/NumberPalindromeTest.java) |
| 4 | Calculate Simple Interest | [`src/main/java/com/example/SimpleInterest.java`](src/main/java/com/example/SimpleInterest.java) | [`src/test/java/com/example/SimpleInterestTest.java`](src/test/java/com/example/SimpleInterestTest.java) |
| 5 | Calculate Student Grade Based on Marks | [`src/main/java/com/example/StudentGrade.java`](src/main/java/com/example/StudentGrade.java) | [`src/test/java/com/example/StudentGradeTest.java`](src/test/java/com/example/StudentGradeTest.java) |
| 6 | Sum of Elements in an Array | [`src/main/java/com/example/ArraySum.java`](src/main/java/com/example/ArraySum.java) | [`src/test/java/com/example/ArraySumTest.java`](src/test/java/com/example/ArraySumTest.java) |
| 7 | Maximum Element in an Array | [`src/main/java/com/example/ArrayMax.java`](src/main/java/com/example/ArrayMax.java) | [`src/test/java/com/example/ArrayMaxTest.java`](src/test/java/com/example/ArrayMaxTest.java) |
| 8 | Count Number of Vowels in a String | [`src/main/java/com/example/VowelCount.java`](src/main/java/com/example/VowelCount.java) | [`src/test/java/com/example/VowelCountTest.java`](src/test/java/com/example/VowelCountTest.java) |
| 9 | Reverse a String | [`src/main/java/com/example/ReverseString.java`](src/main/java/com/example/ReverseString.java) | [`src/test/java/com/example/ReverseStringTest.java`](src/test/java/com/example/ReverseStringTest.java) |
| 10 | Check Whether a String is Palindrome | [`src/main/java/com/example/StringPalindrome.java`](src/main/java/com/example/StringPalindrome.java) | [`src/test/java/com/example/StringPalindromeTest.java`](src/test/java/com/example/StringPalindromeTest.java) |
| - | Master Suite Runner (Runs all 10) | [`src/main/java/com/example/Main.java`](src/main/java/com/example/Main.java) | - |

---

## Directory Layout

```
all10/
├── .gitignore
├── Jenkinsfile
├── pom.xml
├── README.md
└── src
    ├── main/java/com/example/
    │   ├── Fibonacci.java
    │   ├── ReverseNumber.java
    │   ├── NumberPalindrome.java
    │   ├── SimpleInterest.java
    │   ├── StudentGrade.java
    │   ├── ArraySum.java
    │   ├── ArrayMax.java
    │   ├── VowelCount.java
    │   ├── ReverseString.java
    │   ├── StringPalindrome.java
    │   └── Main.java
    └── test/java/com/example/
        ├── FibonacciTest.java
        ├── ReverseNumberTest.java
        ├── NumberPalindromeTest.java
        ├── SimpleInterestTest.java
        ├── StudentGradeTest.java
        ├── ArraySumTest.java
        ├── ArrayMaxTest.java
        ├── VowelCountTest.java
        ├── ReverseStringTest.java
        └── StringPalindromeTest.java
```

---

## Local Maven Commands

### 1. Compile
```bash
mvn clean compile
```

### 2. Run All Tests
```bash
mvn test
```

### 3. Package Executable JAR
```bash
mvn package
```

### 4. Run All 10 Programs
```bash
java -jar target/all10-1.0-SNAPSHOT.jar
```

---

## Jenkins Pipeline Setup

### Steps to Build in Jenkins:
1. Open Jenkins (`http://localhost:8080`).
2. Click **New Item** on the left menu.
3. Enter item name: `all10-pipeline` $\rightarrow$ select **Pipeline** $\rightarrow$ click **OK**.
4. Scroll down to the **Pipeline** section:
   - **Definition**: `Pipeline script from SCM`
   - **SCM**: `Git`
   - **Repository URL**: `https://github.com/kaarun0908/all10.git`
   - **Branch Specifier**: `*/main`
   - **Script Path**: `Jenkinsfile`
5. Click **Save**.
6. Click **Build Now**.
7. Click on the build (e.g. `#1`) $\rightarrow$ click **Console Output** to view the outputs of all 10 programs!