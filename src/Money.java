public class Money {

    public static float change(TipoMoneda origen, TipoMoneda destino, float money) {
        float moneyConverted;
        if (money > 0) {
            if (origen.equals(TipoMoneda.EUR) && destino.equals(TipoMoneda.USD)) {
                moneyConverted = money * 1.18798F;
            } else if(origen.equals(TipoMoneda.USD) && destino.equals(TipoMoneda.EUR)) {
                moneyConverted = money * 0.841815F;
            } else if (origen.equals(TipoMoneda.EUR) && destino.equals(TipoMoneda.GBP)) {
                moneyConverted = money * 0.857839F;
            } else if (origen.equals(TipoMoneda.GBP) && destino.equals(TipoMoneda.EUR)) {
                moneyConverted = money * 1.165826F;
            } else {
                moneyConverted = -1F;
            }
        } else {
            moneyConverted = -1F;
        }
        return moneyConverted;
    }
}
