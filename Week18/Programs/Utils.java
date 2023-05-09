    import java.util.Random;
    public class Utils {
        public void shuffleArrayInPlace(String arr[], int size) {
            Random rand = new Random();
        for(int i = 0; i < size; i++){
            
            int lastIndex = size - i - 1;
            
            int randomIndex = rand.nextInt(lastIndex + 1);
            
            String tempSwapper = arr[lastIndex];
            arr[lastIndex] = arr[randomIndex];
            arr[randomIndex] = tempSwapper;
        }
    }
    
    
    public Boolean contains(String arr[], int size, String val) {
        for(int i = 0; i < size; i++){
            if(arr[i] == val){
                return true;
            }
        }
        return false;
    }
    }