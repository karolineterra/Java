public class StartTv {
    boolean ligada = false;
    int canal = 0;
    int volume = 0;

    public String botaoLigar(){
        if (ligada == true) {
            ligada = false;
            return("A televisão foi desligada");
        } else {
            ligada = true;
            return("A televisão foi ligada");
        }
    }

    public String aumentarVolume(){
        if(ligada == true) {
            volume++;
            return("O volume foi aumentado para " + volume);
        } else {
            return("A televisão está desligada");
        }
        
    }

    public String diminuirVolume(){
        if(ligada == true) {
            if (volume > 0){
                volume--;
                return("O volume foi diminuido para " + volume);
            }
            else {
                return("A televisão está no volume mínimo");
            }
            
        } else {
            return("A televisão está desligada");
        }
        
    }

    public String proximoCanal() {
        if(ligada == true) {
            canal++;
            return("O canal foi mudado para " + canal);
        } else {
            return("A televisão está desligada");
        }
        
    }

    public String canalAnterior(){
        if(ligada == true) {
            if(canal > 0){
                canal--;
                return("O canal foi alterado para " + canal);
            } else {
                return("Este é o primeiro canal, não há como retornar");
            }
        } else {
            return("A televisão está desligada");
        }
    }

    public String escolherCanal(int numCanal) {
        if(ligada == true){
            canal = numCanal;
            return("O canal foi mudado para " + canal);
        } else {
            return("A televisão está desligada");
        }
        
    }

}
