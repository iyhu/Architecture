

import javax.swing.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception{
        String name = null;



        Scanner sc = new Scanner(System.in);
        System.out.println("尊敬的用户您好，请选择您处理文件要用的体系结构风格：");
        System.out.println("1.主程序-子程序软件体系结构 2.面向对象软件体系结构 " +
                "3.事件系统软件体系结构 4.管道-过滤软件体系结构");
        int a = sc.nextInt();
        //System.out.println(a);
        System.out.println("好的，请输入您要处理的文件位置：");
        String location = sc.next();
       // System.out.println(name);

        if(a==1) {
            System.out.println("接下来先为您简单介绍一下主程序-子程序软件体系结构\n" +
                    "主程序-子程序软件体系结构将软件系统分为主程序和子程序两个部分，主程序负责用户界面和资源管理，子程序执行具体功能。适用于复杂系统需要模块化和扩展的场景。");
            name = "F:\\软件体系结构\\主程序子程序.png";
            MainSon.demo01.main(args,location);
        }
        else if(a==2){
            System.out.println("接下来先为您简单介绍一下面向对象软件体系结构\n" +
                    "面向对象软件体系结构是一种将软件系统划分为一组相互关联的对象的设计方法，每个对象具有自己的状态和行为，并通过消息传递进行通信和协作。其主要特点包括封装、继承、多态和消息传递。");
            name = "F:\\软件体系结构\\面向对象.png";
            OOP.Main.main(args,location);
        }
        else if(a==3){
            System.out.println("接下来先为您简单介绍一下事件系统软件体系结构\n" +
                    "事件系统软件体系结构包括事件生成器、事件处理器、事件存储器、事件监听器和事件管理器。这些组件通过定义好的接口进行通信和协作，形成一个完整的事件系统");
            name = "F:\\软件体系结构\\事件.png";
            Event.Main.main(args,location);
        }
        else{
            try {
                System.out.println("接下来先为您简单介绍一下管道-过滤软件体系结构\n" +
                        "管道-过滤软件体系结构是一种处理流式数据的模式，由一系列过滤器和管道组成，数据流通过过滤器逐步处理和转化。");
                name = "F:\\软件体系结构\\管道.png";
                Pipe.Main.main(args,location);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

            Thread.sleep(3000);

        System.out.println("这是相应原理图：");

            Thread.sleep(1000);

        Main main= new Main();

        String finalName = name;

        Runnable runnable = new Runnable() {
            public void run() {
                main.createAndShowGUI(finalName);
            }
        };
        javax.swing.SwingUtilities.invokeLater (runnable);

            Thread.sleep(3000);


        System.out.println("您的文件已经处理完成如下");
        Path path = Paths.get("E:/output.txt");
        String data = null;
        try {
            data = Files.readString(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(data);
        Thread.sleep(5000);
        System.exit(0);
        /*Main main= new Main();

        String finalName = name;
        Runnable runnable = new Runnable() {
            public void run() {
                main.createAndShowGUI(finalName);
            }
        };
        javax.swing.SwingUtilities.invokeLater (runnable);*/
    }
    private  void createAndShowGUI(String name) {
        //创键并设置窗体
        JFrame frame = new JFrame("Hello Swing");

        //为窗体设置一些参数：
        //显示窗体
        frame.setVisible(true);
        //调整窗体的大小
        frame.setSize(650, 650);
        //设置窗体的位置
        frame.setLocation(400, 100);

        //添加图像
       /* frame.add(new JLabel(new ImageIcon("C:\\Users\\ASUS\\Pictures\\Saved Pictures\\1.jpg")));
*/

        frame.add(new JLabel(new ImageIcon(name)));

        //窗体关闭时退出程序
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}


