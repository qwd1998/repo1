package cn.itcast.day02.demo.demo1SHUZHU;

public class CreditApply {
    private String serialno;
    private String name;
    private String vouchType;
    private Double sum;

    public CreditApply(String serialno, String name, String vouchType, Double sum) {
        this.serialno = serialno;
        this.name = name;
        this.vouchType = vouchType;
        this.sum = sum;
    }



    public String getSerialno() {
        return serialno;
    }

    public String getName() {
        return name;
    }

    public String getVouchType() {
        return vouchType;
    }

    public Double getSum() {
        return sum;
    }
}
