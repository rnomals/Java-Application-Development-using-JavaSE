public class Member {
    
    private String memberID;
    private String name;
    private String address;
    private String phoneNumber;

    Member(String memberID,String name, String address, String phoneNumber){
        this.memberID = memberID;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public void displayMemberInfo(){
        System.out.println("Member ID: "+memberID);
        System.out.println("Name: "+name);
        System.out.println("Address: "+address);
        System.out.println("Phone Number: "+phoneNumber);
    }

    public String getMemberId(){
        return this.memberID;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(String address){
        this.address = address;
    }
}
