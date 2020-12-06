package work03;

public class Jinli extends Abt{

    private int jingJin;

    public int getJingJin() {
        return jingJin;
    }

    public void setJingJin(int jingJin) {
        this.jingJin = jingJin;
    }

    @Override
    public void tongZhi() {
        System.out.println("通知：\n" +
                "\t\t"+this.getJingJin()+"万奖金的"+super.getName()+"\n" +
                "\t\txxxxxxxxx\n" +
                "\t\t\t必胜环球科技有限公司");
    }
}
