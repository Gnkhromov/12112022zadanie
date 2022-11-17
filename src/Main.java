import java.util.Scanner;
import java.util.Arrays;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите номер программы, которую вы хотите исполнить:\n 1)Выводит все элементы массива\n 2)Выводит все элементы массива в обратном порядке\n 3)Выводит четные элементы массива\n 4)Выводит все элементы массива через 1\n 5)Выводит все элементы массива до тех пор, пока не встретится -1\n 6)В массив добавляется элемент в конец\n 7)В массив добавляется элемент в начало\n 8)Добавить элемент в массив в позицию\n 9)Из массива удаляется элемент с конца\n 10)Из массива удаляется элемент с начала\n 11)Из массива удаляется элемент с позиции\n 12)Создание массива из двух массивов");
        int vybor = scan.nextInt();
        if(vybor==1)
        {
            one();
        }
        else if(vybor==2)
        {
            two();
        }
        else if(vybor==3)
        {
            three();
        }
        else if(vybor==4)
        {
            four();
        }
        else if(vybor==5)
        {
            five();
        }
        else if(vybor==6)
        {
            six();
        }
        else if(vybor==7)
        {
            seven();
        }
        else if(vybor==8)
        {
            eight();
        }
        else if(vybor==9)
        {
            nine();
        }
        else if(vybor==10)
        {
            ten();
        }
        else if(vybor==11)
        {
            eleven();
        }
        else if(vybor==12)
        {
            twelve();
        }
        else
        {
            System.out.println("Неправильно выбран номер программы повторите попытку");
        }
    }
    static void one()
    {
        int [] arr1 = {1,8,56,78,65,98,75,65,35,39};
        System.out.println("Вывод всех элементов массива:");
        for(int i = 0; i< arr1.length;i++)
        {
            System.out.println(arr1[i]);
        }
    }
    static void two()
    {
        int [] arr1 = {1,8,56,78,65,98,75,65,35,39};
        System.out.println("Вывод всех элементов массива в обратном порядке:");
        for(int i = arr1.length-1; i >= 0;i--)
        {
            System.out.println(arr1[i]);
        }
    }
    static void three()
    {
        int [] arr1 = {1,8,56,78,65,98,75,65,35,39};
        for(int i = 0; i < arr1.length;i++)
        {
            if(i % 2 == 0)
            {
                System.out.println("Индекс элемента массива:" + i + ")");
                System.out.println(arr1[i]);
            }
        }

    }
    static void four()
    {
        int [] arr1 = {1,8,56,78,65,98,75,65,35,39};
        for(int i = 0; i < arr1.length;i++)
        {
            if(i % 2 != 0)
            {
                System.out.println("Индекс элемента массива:" + i + ")");
                System.out.println(arr1[i]);
            }
        }
    }
    static void five()
    {
        int [] arr1 = {7,58,68,52,63,27,-1,83,25,36,45,69};
        for(int i = 0; arr1[i] != -1;i++)
        {
            System.out.println(arr1[i]);
        }
    }
    static void six()
    {
        double [] arr1 = {7.85,86,650.5,61.2,68.789};
        Scanner scann = new Scanner(System.in);
        System.out.println("Какое число вы хотите добавить в конец массива?");
        double chislo = scann.nextDouble();
        arr1 = Arrays.copyOf(arr1,arr1.length + 1);
        arr1[arr1.length-1] = chislo;
        System.out.println("Ваш новый массив:");
        for(int i = 0;i< arr1.length;i++)
        {
            System.out.println(arr1[i]);
        }
    }
    static void seven()
    {
        double [] arr2;
        double [] arr1 = {7.85,86,650.5,61.2,68.789};
        Scanner scann = new Scanner(System.in);
        System.out.println("Какое число вы хотите добавить в начало массива?");
        double chislo = scann.nextDouble();
        arr1 = Arrays.copyOf(arr1,arr1.length + 1);
        arr2 = Arrays.copyOf(arr1,arr1.length);
        for (int i = 1;i < arr1.length;i++)
        {
            arr2[arr2.length-i] = arr1[arr1.length-i-1];
        }
        arr2[0] = chislo;
        for(int j = 0; j< arr2.length;j++)
        {
            System.out.println(arr2[j]);
        }

    }
    static void eight()
    {
        double [] arr2;
        double [] arr1 = {7.85,86,650.5,61.2,68.789};
        Scanner scanne = new Scanner(System.in);
        System.out.println("В какой индекс массива вы хотите добавить число?");
        int index = scanne.nextInt();
        System.out.println("Какое число вы хотите добавить массив?");
        double chislo = scanne.nextDouble();
        arr1 = Arrays.copyOf(arr1,arr1.length + 1);
        arr2 = Arrays.copyOf(arr1,arr1.length);
        for(int i = arr1.length-1;i > index;i--)
        {
            arr2[i]=arr1[i-1];
        }
        arr2[index] = chislo;
        for(int j = 0; j< arr2.length;j++)
        {
            System.out.println(arr2[j]);
        }
    }
    static void nine()
    {
        double [] arr1 = {7.85,86,650.5,61.2,68.789};
        arr1 = Arrays.copyOf(arr1,arr1.length - 1);
        System.out.println("Ваш новый массив:");
        for(int i = 0;i< arr1.length;i++)
        {
            System.out.println(arr1[i]);
        }
    }
    static void ten()
    {
        double [] arr2;
        double [] arr1 = {7.85,86,650.5,61.2,68.789};
        arr2 = Arrays.copyOf(arr1,arr1.length-1);
        for (int i = arr1.length-1;i >=1;i--)
        {
            arr2[arr2.length-i] = arr1[arr1.length-i];
        }
        for(int j = 0; j< arr2.length;j++)
        {
            System.out.println(arr2[j]);
        }
    }
    static void eleven()
    {
        double [] arr2;
        double [] arr1 = {7.85,86,650.5,61.2,68.789};
        Scanner scanne = new Scanner(System.in);
        System.out.println("Какой элемент массива вы хотите удалить?");
        int index = scanne.nextInt();
        arr2 = Arrays.copyOf(arr1,arr1.length-1);
        for(int i = 0;i < arr1.length;i++)
        {
            if (i < index+1)
            {
                arr2[i] = arr1[i];
            }
            else
            {
                arr2[i-1] = arr1[i];
            }
        }
        for(int j = 0; j < arr2.length;j++)
        {
            System.out.println(arr2[j]);
        }
    }
    static void twelve()
    {
        double [] arr2 = {52.4,56.3,48.5,87,36};
        double [] arr1 = {7.85,86,650.5,61.2,68.789};
        double[] obyed;
        obyed = new double[arr1.length + arr2.length];
        int index = 0;
        int[] result = new int[arr1.length + arr2.length];

        System.arraycopy(arr1, 0, obyed, 0, arr2.length);
        System.arraycopy(arr2, 0, obyed, arr1.length, arr2.length);

        for(int j = 0; j < obyed.length;j++)
        {
            System.out.println(obyed[j]);
        }
    }
}