# 🚀 New Features in Java

A quick reference to how Java has evolved, its goals, and major feature highlights across versions.  
Java continues to evolve rapidly with features that enhance **developer productivity, performance, and cloud-readiness**.

---

## 📌 On this page
- [How is Java Marching Forward?](#how-is-java-marching-forward-)
- [What are the Primary Goals Behind Recent Java Releases?](#what-are-the-primary-goals-behind-recent-java-releases-)
- [Major Java Versions and Their Most Important Features](#major-java-versions-and-their-most-important-features-)

---

## How is Java Marching Forward? #

### 🔍 Breaking Myth
**Myth**: "Java is old and unpopular"  
**Truth**: Java remains one of the **most popular programming languages worldwide!**

Java is one of the popular choices for building:  
- Modern cloud applications (Spring Boot, Quarkus, Micronaut)

👉 **IMHO:** Java is evolving faster than ever, staying modern, powerful, and future-proof!

### 🚀 Continuous Innovation in Java Ecosystem
- **Java 8** – Embraced functional programming with Lambda expressions and Streams.  
- **Java 9** – Introduced modularization to the Java Platform – enabling faster startup and less memory footprint.  
- **Java 10 to NOW** – Six-month release cycle for faster updates and quick feedback.  
- **Java 11 to NOW** – Reduced code verbosity.  
  - Switch Expressions – More concise conditional logic.  
  - Text Blocks – Simplifies multi-line strings.  
  - Records – Reduces boilerplate for data objects.  
  - Pattern Matching – Enhances readability.  
- **Java 21 to NOW**:  
  - Project Loom – Virtual threads for high-performance concurrency.  
  - Cloud & Container-Ready – Optimized for cloud-native apps.

---

## What are the Primary Goals Behind Recent Java Releases? #

### ✨ Make it concise – Reduce boilerplate & improve readability.
**Records**  
```java
record Person(String name, int age) {}
```

**Switch Expressions**  
```java
String result = switch (day) {
    case MONDAY, FRIDAY -> "Weekend is near!";
    default -> "Regular day.";
};
```

### ☁️ Cloud & container support
- Optimized JDK container images for smaller footprint & faster startup.  
- GraalVM for efficient native image compilation.

### ⚡ Improve concurrency
**Virtual Threads**  
```java
Thread.startVirtualThread(
    () -> System.out.println("Hello from a virtual thread!"));
```

### 👩‍💻 Developer productivity
**JShell**  
```java
jshell> System.out.println("Hello, Java!");
```

**Simpler Main Without Class**  
```java
// HelloWorld.java
void main() {
  System.out.println("Hello, World!");
}
```

**Easy Launch without Compilation**  
```bash
$ java HelloWorld.java
```

### ⚙️ Performance Goals
- Reduce startup time.  
- Optimize Garbage Collection (GC) for lower latency.  
- Ensure backward compatibility for smooth migration.

---

## Major Java Versions and Their Most Important Features? #

### 📌 J2SE 5.0
- Enhanced For Loop  
```java
for (int num : numbers) { /* ... */ }
```

- Generics  
```java
public class HashMap<K,V> extends AbstractMap<K,V>
```

- Enums  
```java
enum Season { WINTER, SPRING, SUMMER, FALL }
```

- Autoboxing  
```java
Integer integer = 5;
int i = integer;
```

---

### 📌 Java SE 7
- Try-With-Resources  
```java
try (BufferedReader br = new BufferedReader(new FileReader("file.txt"))) { }
```

- Strings in Switch  
```java
switch (day) {
    case "Monday": // ...
    case "Friday": // ...
    default: // ...
}
```

---

### 📌 Java SE 8
- Lambda Expressions  
```java
return course -> course.getReviewScore() > cutoff;
```

- Streams API  
```java
List<String> result = numbers.stream()
            .map(x -> x * x)
            .map(x -> x + 10)
            .map(x -> "Value: " + x)
            .toList();
```

- Functional Programming  
```java
courses.stream()
       .sorted((c1, c2) -> c1.length() - c2.length())
       .forEach(System.out::println);
```

---

### 📌 Java SE 9
- Modularization  
- JShell (REPL)  
```java
jshell> System.out.println("Hello, Java!");
```

---

### 📌 Java SE 10
- Local Variable Type Inference (`var`)  
```java
var numbers = new ArrayList<String>();
var map = new HashMap<Integer, String>();
```

---

### 📌 Java SE 14
- Switch Expressions  
```java
String result = switch (day) {
      case MONDAY, FRIDAY -> "Weekend is near!";
      default -> "Regular day.";
};
```

---

### 📌 Java SE 15
- Text Blocks  
```java
String json = """
    {
      "name": "John",
      "age": 30
    }
    """;
```

---

### 📌 Java SE 16
- Pattern Matching for `instanceof`  
```java
if (obj instanceof String s) {
    System.out.println("Message: " + s);
}
```

- Record Classes  
```java
public record Person(String name, String email, String phoneNumber) {}
```

---

### 📌 Java SE 17
- Sealed Classes  
```java
sealed class Vehicle permits Car, Truck, Bike {}
```

---

### 📌 Java SE 21
- Virtual Threads  
```java
Thread.startVirtualThread(() -> System.out.println("Hello!"));
```

- Sequenced Collections  
```java
interface SequencedCollection<E> extends Collection<E> {
    void addFirst(E element);
    void addLast(E element);
}
```

- Record Patterns  
```java
if (obj instanceof Transaction(String sender, String receiver, double amount)) {
    System.out.println(sender + " -> " + receiver + " : ₹" + amount);
}
```

- Pattern Matching for Switch  
```java
String response = switch (message) {
    case TextMessage(String text) -> "Processing text: " + text;
    case Ticket(int ticketNumber) -> "Processing ticket: #" + ticketNumber;
};
```

---

### 📌 Java SE 22
- Unnamed Variables & Patterns  
```java
switch (obj) {
    case String _ -> System.out.println("String");
    case Integer _ -> System.out.println("Integer");
    default -> System.out.println("Unknown type.");
}
```

---

### 📌 Java SE 23
- Markdown Documentation Comments  
```java
/// This is the **traditional** *Hello World!* program.
```

---

### 📌 Java SE 24
- Stream Gatherers  
```java
List<List<Integer>> windows = numbers.stream()
    .gather(Gatherers.windowFixedSize(3))
    .toList();
```

---

## 📌 Ongoing Improvements
- Performance Optimizations (startup, memory, efficiency)  
- Garbage Collection Enhancements  
- API & Syntactic Improvements  

---

🔗 **Reference:** [in28minutes Java Interview Guide](https://interview.in28minutes.com/interview-guides/java/new-features-in-java/)
