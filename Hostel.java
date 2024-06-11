public class Hostel
{
    private String studentName;
    private String icNo;
    private String date;
    private char category;
    private String roomType;
    
    public Hostel(String s, String i, String d, char c, String r){
        this.studentName = s;
        this.icNo = i;
        this.date = d;
        this.category = c;
        this.roomType = r;
    }
    
    public void setStudentName(String s){this.studentName = s;}
    public void setICNo(String i){this.icNo = i;}
    public void setDate(String d){this.date = d;}
    public void setCategory(char c){this.category = c;}
    public void setRoomType(String r){this.roomType = r;}
    
    public String getStudentName(){return this.studentName;}
    public String getICNo(){return this.icNo;}
    public String getDate(){return this.date;}
    public char getCategory(){return this.category;}
    public String getRoomType(){return this.roomType;}
    
    public String toString(){
        return "\nStudent Name : " + this.getStudentName() + "\nIC : " + this.getICNo() + "\nDate : " + this.getDate() +
        "\nCategory : " + this.getCategory() + "\nRoom Type : " + this.getRoomType();
    }
}
