package day0613.day0613_4;

public class Baby extends Student {
    int babyNo;

    public Baby(String name, String ssn, int studentNo, int babyNo) {
        super(name, ssn, studentNo);
        this.babyNo = babyNo;
    }
}
