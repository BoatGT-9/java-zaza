public class Main {
    public static void main(String[] args) {
        Employee graham = new Employee("Boat",
                "CEO",
                "Making excutive decisions");
        Employee sara = new Employee("Sofe",
                "Consultant",
                "Consuting the company");
        Employee tim = new Employee("Ken",
                "Salesmen",
                "Selling the company's products");
        Employee emma = new Employee("Shi",
                "Developer",
                "Developing the latest mobile app.");
        graham.printCurrentAssignment();
        sara.printCurrentAssignment();
        tim.printCurrentAssignment();
        emma.printCurrentAssignment();
    }
}