package todolist;
import java.time.LocalDate;

public class Tasks{
    private int num;
    private String name;
    private LocalDate startDate;
    private LocalDate dueDate;
    private String desc;

    public void setNum(int num) {
        this.num = num;
    }

    public Tasks(int num, String name, String desc, LocalDate startDate, LocalDate dueDate) {
        this.num = num;
        this.name = name;
        this.desc = desc;
        this.startDate = startDate;
        this.dueDate = dueDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }



    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }



    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

   
    public int getNum() {
        return num;
    }

    public String getName() {
        return name;
    }



    public String getDesc() {
        return desc;
    }



    public LocalDate getStartDate() {
        return startDate;
    }



    public LocalDate getDueDate() {
        return dueDate;
    }

    public static void main(String[] args) {
        
    }

    public String toString(){
        return (num+" "+name+" "+desc+" "+startDate+" "+dueDate);
    }


}