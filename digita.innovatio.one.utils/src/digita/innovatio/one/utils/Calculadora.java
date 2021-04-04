package digita.innovatio.one.utils;


import digita.innovatio.one.utils.interna.DivHelper;
import digita.innovatio.one.utils.interna.MultHelper;
import digita.innovatio.one.utils.interna.SubHelper;
import digita.innovatio.one.utils.interna.SumHelper;

public class Calculadora {

    private DivHelper divHelper;
    private MultHelper multHelper;
    private SubHelper subHelper;
    private SumHelper sumHelper;


    public Calculadora() {
        this.divHelper = new DivHelper();
        this.multHelper = new MultHelper();
        this.subHelper = new SubHelper();
        this.sumHelper = new SumHelper();
    }

    public  int sum(int a, int b){
        return this.sumHelper.execute(a,b);
    }

    public  int div(int a, int b){
        return this.divHelper.execute(a,b);
    }

    public  int mult(int a, int b){
        return this.multHelper.execute(a,b);
    }

    public  int sub(int a, int b){
        return this.subHelper.execute(a,b);
    }



}
