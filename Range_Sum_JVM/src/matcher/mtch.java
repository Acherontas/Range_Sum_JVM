/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matcher;

/**
 *
 * @author acherontas
 */
public class mtch {
    public int special_one[]={1,1,6,2,1};
    public int arr_one[]={1,1,6,2,7};
    public int arr_two[]={2,5,1,6,2};
    public int arr_three[]={3,9,5,1,6};
    public int arr_four[]={4,4,9,5,1};
    public int arr_five[]={5,8,4,9,5};
    public int arr_six[]={6,3,8,4,9};
    public int arr_seven[]={7,7,3,8,4};
    public int arr_eight[]={8,2,7,3,8};
    public int arr_nine[]={9,6,2,7,3};
    public int match_them(int[] arr){
            
        if(arr[0]==arr_one[1] && arr[1]==arr_one[2] && arr[2]==arr_one[3] && arr[3]==arr_one[4]){return arr_one[0];}
        if(arr[0]==arr_two[1] && arr[1]==arr_two[2] && arr[2]==arr_two[3] && arr[3]==arr_two[4]){return arr_two[0];}
        if(arr[0]==arr_three[1] && arr[1]==arr_three[2] && arr[2]==arr_three[3] && arr[3]==arr_three[4]){return arr_three[0];}
        if(arr[0]==arr_four[1] && arr[1]==arr_four[2] && arr[2]==arr_four[3] && arr[3]==arr_four[4]){return arr_four[0];}
        if(arr[0]==arr_five[1] && arr[1]==arr_five[2] && arr[2]==arr_five[3] && arr[3]==arr_five[4]){return arr_five[0];}
        if(arr[0]==arr_six[1] && arr[1]==arr_six[2] && arr[2]==arr_six[3] && arr[3]==arr_six[4]){return arr_six[0];}
        if(arr[0]==arr_seven[1] && arr[1]==arr_seven[2] && arr[2]==arr_seven[3] && arr[3]==arr_seven[4]){return arr_seven[0];}
        if(arr[0]==arr_eight[1] && arr[1]==arr_eight[2] && arr[2]==arr_eight[3] && arr[3]==arr_eight[4]){return arr_eight[0];}
        if(arr[0]==arr_nine[1] && arr[1]==arr_nine[2] && arr[2]==arr_nine[3] && arr[3]==arr_nine[4]){return arr_nine[0];}
        if(arr[0]==special_one[1] && arr[1]==special_one[2] && arr[2]==special_one[3] && arr[3]==special_one[4]){return special_one[0];}
        
    return 0;
    }
}
