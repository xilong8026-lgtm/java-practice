public class StudentTest1 {
    static void main() {

    /*要求3:通过ID删除学生信息
            如果存在,则删除,如果不存在,则提示删除失败
    要求4:删除完毕之后,遍历所有学生信息
    要求5:查询数字ID为"001"的学生,如果存在,则将他的年龄+1*/

        //创建一个数组用来储存学生对象
        Student[] arr = new Student[3];
        //创建学生对象并添加到数组当中
        Student stu1 = new Student(1, "老王", 19);
        Student stu2 = new Student(2, "老五", 22);
        Student stu3 = new Student(3, "老六", 21);
        //把学生对象添加到数组当中
        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;

        //要找到ID在数组中的索引
        int index = getIndex(arr,4);
        if(index >= 0){
            //如果存在,则删除
            arr[index] = null;
            printArr(arr);
        }else{
         //如果不存在,则提示删除失败
            System.out.println("当前ID不存在,删除失败");
        }
    }

    //我要干嘛? 要找到ID在数组中的索引
    //我需要什么? 数组 ID
    //调用处是否需要继续使用方法的结果 ? 要
    public static int getIndex(Student[] arr , int id){
        for (int i = 0; i < arr.length; i++) {
            //一次得到每一个学生对象
            Student stu = arr[i];
            //对stu进行一个非空判断
            if(stu != null){
                int sid = stu.getId();
                if(sid == id){
                    return i;

                }
            }
        }
        //当循环结束之后,还没有找到就表示不存在
        return -1;
    }
    public static void printArr(Student[] arr){
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if(arr[i] != null){
                System.out.println(stu.getId() + ", " + stu.getName() + ", " + stu.getAge());

            }
        }

    }


}