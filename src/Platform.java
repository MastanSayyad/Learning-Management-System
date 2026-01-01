
/**
 * Learning Management System (LMS) Single level: Class inherited from only one
 * class (Parent Class ---> Child Class)
 *
 * Multi level inheritance: - It is a type of inheritance where a class inherits
 * from another class, which then inherits from a third class. - This means
 * there is a parent class, a child class that extends the parent, and then a
 * grandchild class that extends the child.  *
 * Chain of inheritance:
 * <--parent-----child-----grandChild----greatGrandChild---->
 *
 * Example: Platfrom -> Course -> Instructor -> Student Vehicle -> Car ->
 * Electric Car -> Tesla CEO -> Director -> Manager -> Employee Animal -> Mamals
 * -> Dog -> BullDog
 *
 * +------------------+-------------------------------------------------------------------+
 * | Concept | Explanation |
 * |------------------+-------------------------------------------------------------------|
 * | super() | Used to call parent constructor or methods | | this() | Used to
 * call another constructor in same class | | this | Used When an instance
 * variable (field) and a local variable | | | or method parameter have the same
 * name (Current class object ref)| | extends | Inheriting features (properties,
 * methods) from other class | | Encapsulation | hiding data using `private` and
 * accessing using set/get | | Abstraction | hide unwanted details, show only
 * necessary | | Overriding | Same name, same parameters, different class
 * (runtime) | | @Override | Indicates that method in a child has override a
 * method from Parent| | Overloading | Same name, different parameters, same
 * class (compile-time) | | Constructor order| Always runs from parent → child |
 * | Polymorphism | One name, many forms |
 * +------------------+-------------------------------------------------------------------+
 *
 * for constructor recursion is not allowed; (cause it is not possiblle) same
 * constructor cannot be excuted using this() constructor cannot be inherited
 * costructor can be overloaded --> zero args costructor, default constructor,
 * parameterized constructor constructor also behaves like special type of
 * setter.
 *
 * static = Belongs to class non static = Belongs to objects
 *
 * Static references cannot refer to non-static members. Non-static members can
 * reference static members.
 *
 */

public abstract class Platform {

    String platformName;
    String platformVersion;

    Platform(String platformName, String platformVersion) {
        this.platformVersion = platformVersion;
        this.platformName = platformName;
        System.out.print("This is a Platform Constructor for " + platformName);
        System.out.println(", Version " + platformVersion);
    }

    void displayInfo() {
        System.out.println("Platfrom Name: " + platformName);
    }

    // Overloading --> displayInfo --> same name different result
    String displayInfo(String pVersion) {
        platformVersion = pVersion;
        return pVersion;
    }

    abstract void login();

}
