package digita.innovatio.one.utils.interna;

import digita.innovatio.one.utils.operacaoes.Operacao;

public class MultHelper  implements Operacao {
    @Override
    public int execute(int a, int b) {
        return a*b;
    }
}
