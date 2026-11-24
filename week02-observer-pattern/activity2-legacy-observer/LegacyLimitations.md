# Limitations of java.util.Observer and java.util.Observable

## Limitation 1: Single Inheritance
Explain: Why is it a problem that Observable is a CLASS, not an INTERFACE?

Your answer: The notifyObservers() method only works if setChanged() is called first. If it is forgotten, observers will not receive updates, which can cause bugs.

## Limitation 2: Cannot Change the Notification Order
Explain: In what order are observers notified? Can you control this?

Your answer: Observers are notified in an unspecified order. The notification order cannot easily be controlled.

## Limitation 3: setChanged() is Confusing
Explain: Why must you call setChanged() before notifyObservers()?

Your answer: The notifyObservers() method only works if setChanged() is called first. If it is forgotten, observers will not receive updates, which can cause bugs.

## Limitation 4: Pull Model by Default

Explain: How does the observer get the data? Is this efficient?

Your answer: The observer receives the Observable object and must call getter methods to retrieve data. This creates extra method calls and can be less efficient than passing data directly.


## Limitation 5: Deprecated Since Java 9
Explain: Why did Java deprecate these classes?

Your answer: The API was deprecated because it relies on inheritance, uses the pull model, provides limited flexibility, has notification-order issues, and is not easily extensible for modern applications.