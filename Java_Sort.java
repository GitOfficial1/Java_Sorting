public class Java_Sort {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Good Night!")
    }

    public static void bubble_sort(*array){
        for(int i = 0; i < array.size(); i = i+1){
            for(int j = 0; j < array.size(); j = j+1)
                if(array.get_elem(j)>array.get_elem(j+1)){
                    Swap(array.get_elem(j),array.get_elem(j+1));
                }
        }
    }
}