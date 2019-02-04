public class createPolicies {
    public static void main(String[] args) {

        carInsurancePolicy first = new carInsurancePolicy(123);
        carInsurancePolicy second = new carInsurancePolicy(456, 4);
        carInsurancePolicy third = new carInsurancePolicy(789, 12, "NewCastle");
        //carInsurancePolicy fourth = new carInsurancePolicy();
        first.display();
        second.display();
        third.display();
    }
}
