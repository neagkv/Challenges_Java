package src.main.java.countiesChallenege;

//DemoInfo pojo
public class DemoInfo {
    //instance variables that each represent one coloumn in the csv file
    private int area_fips;
    private int industry_code;
    private int year;
    private int qrt;
    private String area_title;
    //the coloumn for area_title contained a comma, so created an extra coloumn
    private String area_title2;
    //ndusty_title had an extra comma as well, created and extra coloumn
    private String ndustry_title;
    private String ndustry_title2;
    private int qtrly_estabs_count;
    private int month1_emplvl;
   private int month2_emplvl;
    private long month3_emplvl;
    private long total_qtrly_wages;
    private int avg_wkly_wage;

    //constructor
    public DemoInfo(int area_fips, int industry_code, int year, int qrt, String area_title, String ndustry_title, int qtrly_estabs_count, int month1_emplvl, int month2_emplvl, long month3_emplvl, long total_qtrly_wages, int avg_wkly_wage) {
        this.area_fips = area_fips;
        this.industry_code = industry_code;
        this.year = year;
        this.qrt = qrt;
        this.area_title = area_title;
        this.area_title = area_title;
        this.ndustry_title = ndustry_title;
        this.ndustry_title = ndustry_title2;
        this.qtrly_estabs_count = qtrly_estabs_count;
        this.month1_emplvl = month1_emplvl;
        this.month2_emplvl = month2_emplvl;
        this.month3_emplvl = month3_emplvl;
        this.total_qtrly_wages = total_qtrly_wages;
        this.avg_wkly_wage = avg_wkly_wage;
    }

    //empty constructor
    public DemoInfo() {
    }

    //getters and setters
    public int getArea_fips() {
        return area_fips;
    }

    public void setArea_fips(int area_fips) {
        this.area_fips = area_fips;
    }

    public int getIndustry_code() {
        return industry_code;
    }

    public void setIndustry_code(int industry_code) {
        this.industry_code = industry_code;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getQrt() {
        return qrt;
    }

    public void setQrt(int qrt) {
        this.qrt = qrt;
    }

    public String getArea_title() {
        return area_title;
    }

    public void setArea_title(String area_title) {
        this.area_title = area_title;
    }

    public String getNdustry_title() {
        return ndustry_title;
    }

    public void setNdustry_title(String ndustry_title) {
        this.ndustry_title = ndustry_title;
    }

    public int getQtrly_estabs_count() {
        return qtrly_estabs_count;
    }

    public void setQtrly_estabs_count(int qtrly_estabs_count) {
        this.qtrly_estabs_count = qtrly_estabs_count;
    }

    public int getMonth1_emplvl() {
        return month1_emplvl;
    }

    public void setMonth1_emplvl(int month1_emplvl) {
        this.month1_emplvl = month1_emplvl;
    }

    public int getMonth2_emplvl() {
        return month2_emplvl;
    }

    public void setMonth2_emplvl(int month2_emplvl) {
        this.month2_emplvl = month2_emplvl;
    }



    public long getMonth3_emplvl() {
        return month3_emplvl;
    }

    public void setMonth3_emplvl(long month3_emplvl) {
        this.month3_emplvl = month3_emplvl;
    }

    public long getTotal_qtrly_wages() {
        return total_qtrly_wages;
    }

    public void setTotal_qtrly_wages(long total_qtrly_wages) {
        this.total_qtrly_wages = total_qtrly_wages;
    }

    public int getAvg_wkly_wage() {
        return avg_wkly_wage;
    }

    public void setAvg_wkly_wage(int avg_wkly_wage) {
        this.avg_wkly_wage = avg_wkly_wage;
    }

    public String getNdustry_title2() {
        return ndustry_title2;
    }

    public void setNdustry_title2(String ndustry_title2) {
        this.ndustry_title2 = ndustry_title2;
    }

    public String getArea_title2() {
        return area_title2;
    }

    public void setArea_title2(String area_title2) {
        this.area_title2 = area_title2;
    }


// a method call to be able to call all instance variable except for the extra area_title and ndustry_title
    public void giveInfo(){
        System.out.print(getArea_fips() + " ");
        System.out.print(getIndustry_code()+ " ");
        System.out.print(getYear()+ " ");
        System.out.print(getQrt()+ " ");
        System.out.print(getArea_title()+ " ");
        System.out.print(getNdustry_title()+ " ");
        System.out.print(getQtrly_estabs_count()+ " ");
        System.out.print(getMonth1_emplvl()+ " ");
        System.out.print(getMonth2_emplvl()+ " ");
        System.out.print(getMonth3_emplvl()+ " ");
        System.out.print(getTotal_qtrly_wages()+ " ");
        System.out.println(getAvg_wkly_wage());
    }


}
