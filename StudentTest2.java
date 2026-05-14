public class StudentTest2 {
    static void main() {
        //要求5:查询数字ID为"2"的学生,如果存在,则将他的年龄+1

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

        //4.先要找到ID为2的学生对于的索引
        int index = getIndex(arr, 1);

        //5.判断索引
        if (index >= 0) {
            //存在,则将他的年龄+1岁
            Student stu = arr[index];
            //原来的年龄拿出来
            int newAge = stu.getAge() + 1;
            //把+1之后的年龄给他塞回去
            stu.setAge(newAge);
            printArr(arr);

        } else {
            //不存在,则直接提示
            System.out.println("当前ID不存在,修改失败");
        }
    }


    public static int getIndex(Student[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            //依次得到每一个学生对象
            Student stu = arr[i];
            //对stu进行一个非空判断
            if (stu != null) {
                int sid = stu.getId();
                if (sid == id) {
                    return i;

                }
            }
        }
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