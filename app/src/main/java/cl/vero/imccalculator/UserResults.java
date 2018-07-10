package cl.vero.imccalculator;


public class UserResults extends UserAnswers {

    public UserResults(int sexRg, String userName, int userHeight, int userWeight) {
        super(sexRg, userName, userHeight, userWeight);
    }

    public String imc(){ return result(); }

    private String result(){
        int sexRg = getSexRg();
        String userName = getUserName();
        int userHeight = getUserHeight();
        int userWeight = getUserWeight();

        int weight = Integer.parseInt(String.valueOf(userWeight));
        int height = Integer.parseInt(String.valueOf(userHeight))/100;
        int imcResult = weight/(height*height);


        if (sexRg == 1){
            return "Estimada " + userName + ", tu IMC es " + imcResult;
        } else {
            return "Estimado " + userName + ", tu IMC es " + imcResult;
        }
    }
}
