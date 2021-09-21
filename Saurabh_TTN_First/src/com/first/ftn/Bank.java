package com.first.ftn;

public class Bank
{
    public void getDetails()
    {
        String bank_name = "RBI";
        double rate_interest = 3.0;
        String main_branch = "New_Delhi";
        String ifsc_code = "BANK_000";

        System.out.println("this is the Parent BANK of ALL banks");
        System.out.println("the Bank name is:" +bank_name);
        System.out.println("the Rate of "+bank_name+" Interest is: "+rate_interest);
        System.out.println("the main Branch of "+bank_name+" is placed at: "+main_branch);
        System.out.println("the IFSC code of "+bank_name+" is: "+ifsc_code);
        System.out.println("\n");
    }
}

  class  SBI extends Bank
{
    public void getDetails()
    {

        String bank_name = "SBI";
        double rate_interest = 2.0;
        String main_branch = "Mumbai";
        String ifsc_code = "BANK_001";

        System.out.println("the Bank name is:" +bank_name);
        System.out.println("the Rate of "+bank_name+" Interest is: "+rate_interest);
        System.out.println("the main Branch of "+bank_name+" is placed at: "+main_branch);
        System.out.println("the IFSC code of "+bank_name+" is: "+ifsc_code);
        System.out.println("\n");
    }
}

class BOI extends Bank
{
    public void getDetails()
    {
        String bank_name = "BOI";
        double rate_interest = 2.2;
        String main_branch = "Chennai";
        String ifsc_code = "BANK_002";

        System.out.println("the Bank name is:" +bank_name);
        System.out.println("the Rate of "+bank_name+" Interest is: "+rate_interest);
        System.out.println("the main Branch of "+bank_name+" is placed at: "+main_branch);
        System.out.println("the IFSC code of "+bank_name+" is: "+ifsc_code);
        System.out.println("\n");
    }

}

class ICICI extends Bank
{
    public void getDetails()
    {
        String bank_name = "ICICI";
        double rate_interest = 4.0;
        String main_branch = "GOA";
        String ifsc_code = "BANK_003";

        System.out.println("the Bank name is:" +bank_name);
        System.out.println("the Rate of "+bank_name+" Interest is: "+rate_interest);
        System.out.println("the main Branch of "+bank_name+" is placed at: "+main_branch);
        System.out.println("the IFSC code of "+bank_name+" is: "+ifsc_code);
    }

}

class MainClass
{
    public static void main(String[] args)
    {
        Bank bankObj = new Bank();
        SBI SBIObj = new SBI();
        BOI BOIObj = new BOI();
        ICICI ICICIObj = new ICICI();

        bankObj.getDetails();
        SBIObj.getDetails();
        BOIObj.getDetails();
        ICICIObj.getDetails();

    }
}




