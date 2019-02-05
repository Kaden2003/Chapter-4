public class carInsurancePolicy2
{
    private int policyNumber;
    private int numPayments;
    private String residentCity;

    public carInsurancePolicy2(int num, int payments, String city)
    {
        policyNumber = num;
        numPayments = payments;
        residentCity = city;
    }
    public carInsurancePolicy2(int num, int payments)
        {
            policyNumber = num;
            numPayments = payments;
            residentCity = "Mayfield";
        }
        public carInsurancePolicy2( int num)
        {
            policyNumber = num;
            numPayments = 2;
            residentCity = "Mayfield";
        }

        public void display()
        {
            System.out.println("Policy #" + policyNumber + ". " + numPayments + "payments annually. Driver resides in " + residentCity + ". ");
        }

}