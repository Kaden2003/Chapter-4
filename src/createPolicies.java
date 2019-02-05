public class createPolicies {
    public static void main(String[] args) {

        carInsurancePolicy2 first = new carInsurancePolicy2(123);
        carInsurancePolicy2 second = new carInsurancePolicy2(456, 4);
        carInsurancePolicy2 third = new carInsurancePolicy2(789, 12, "NewCastle");
        //carInsurancePolicy fourth = new carInsurancePolicy();
        first.display();
        second.display();
        third.display();
    }
}
