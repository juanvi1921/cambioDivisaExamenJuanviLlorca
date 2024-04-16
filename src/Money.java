public class Money {

    public static float change(TipoMoneda origen, TipoMoneda destino, float money) {
        float moneyConverted;
        float moneyConvertedEur;
        if (money > 0) {
            if (origen.equals(TipoMoneda.EUR) && destino.equals(TipoMoneda.USD)) {
                moneyConverted = money * 1.18798F;
            } else if(origen.equals(TipoMoneda.USD) && destino.equals(TipoMoneda.EUR)) {
                moneyConverted = money * 0.841815F;
            } else if (origen.equals(TipoMoneda.EUR) && destino.equals(TipoMoneda.GBP)) {
                moneyConverted = money * 0.857839F;
            } else if (origen.equals(TipoMoneda.GBP) && destino.equals(TipoMoneda.EUR)) {
                moneyConverted = money * 1.165826F;
            } else if (origen.equals(TipoMoneda.GBP) && destino.equals(TipoMoneda.USD)) {
                moneyConvertedEur = money * 1.165826F; //Pasem primer a euros els GBP
                moneyConverted = moneyConvertedEur * 1.18798F;
            }else if (origen.equals(TipoMoneda.USD) && destino.equals(TipoMoneda.GBP)) {
                moneyConvertedEur = money * 0.841815F;
                moneyConverted = moneyConvertedEur * 0.857839F;
            } else {
                moneyConverted = -1F;
            }
        } else {
            moneyConverted = -1F;
        }
        return moneyConverted;
    }
}
