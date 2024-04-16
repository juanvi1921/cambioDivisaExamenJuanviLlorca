public class Money {

    public static float change(TipoMoneda origen, TipoMoneda destino, float money) {
        float constEURaUSD = 1.18798F;
        float constUSDaEUR = 0.841815F;
        float constEURaGBP = 0.857839F;
        float constGBPaEUR = 1.165826F;
        float constError = -1F;
        float moneyConverted;
        float moneyConvertedEur;
        if (money > 0) {
            if (origen.equals(TipoMoneda.EUR) && destino.equals(TipoMoneda.USD)) {
                moneyConverted = money * constEURaUSD;
            } else if(origen.equals(TipoMoneda.USD) && destino.equals(TipoMoneda.EUR)) {
                moneyConverted = money * constUSDaEUR;
            } else if (origen.equals(TipoMoneda.EUR) && destino.equals(TipoMoneda.GBP)) {
                moneyConverted = money * constEURaGBP;
            } else if (origen.equals(TipoMoneda.GBP) && destino.equals(TipoMoneda.EUR)) {
                moneyConverted = money * constGBPaEUR;
            } else if (origen.equals(TipoMoneda.GBP) && destino.equals(TipoMoneda.USD)) {
                moneyConvertedEur = money * constGBPaEUR; //Pasem primer a euros els GBP
                moneyConverted = moneyConvertedEur * constEURaUSD;
            }else if (origen.equals(TipoMoneda.USD) && destino.equals(TipoMoneda.GBP)) {
                moneyConvertedEur = money * constUSDaEUR;
                moneyConverted = moneyConvertedEur * constEURaGBP;
            } else {
                moneyConverted = constError;
            }
        } else {
            moneyConverted = constError;
        }
        return moneyConverted;
    }
}
