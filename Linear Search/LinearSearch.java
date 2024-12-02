public class LinearSearch{
    public static void main(String[] args) {
        String name = "Somsubhro";
        String target = "o";


        boolean flag = false;
        for(int i=0; i<=name.length()-1;i++){

            if(String.valueOf(name.charAt(i)).equals(target)){
                System.out.println("the element fount in the index : " + i);
                flag =true;
                break;
            }
        }
        if(!flag){
            System.out.println("Element is not there");

        }
    }
}