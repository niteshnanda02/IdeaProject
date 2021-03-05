package com.company;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.DataBuffer;
import java.awt.image.DataBufferByte;
import java.io.File;
import java.io.IOException;

public class Rotateanimage {
    public static void main(String[] args) {
        int width=640;
        int height=640;
        BufferedImage image=null;
        try {
            File file=new File("/home/nitesh/Downloads/men.jpg");

            image=new BufferedImage(width,height,BufferedImage.TYPE_INT_ARGB);

            image= ImageIO.read(file);
            //convert to grey
            for(int i=0; i<height; i++) {
                for(int j=0; j<width; j++) {
                    Color c = new Color(image.getRGB(j, i));
                    int red = (int)(c.getRed() * 0.299);
                    int green = (int)(c.getGreen() * 0.587);
                    int blue = (int)(c.getBlue() *0.114);
                    Color newColor = new Color(red+green+blue,
                            red+green+blue,red+green+blue);
                    image.setRGB(j,i,newColor.getRGB());
                }
            }

            System.out.println("Reading complete");

            int[][] result=convertTo2D(image);
            display(result);
            System.out.println(result.length*2);
            rotateby90(result);
            System.out.println();
            System.out.println();
            System.out.println("---------------------------------------------");
            display(result);
            BufferedImage convertImage=new BufferedImage(height,width,BufferedImage.TYPE_INT_ARGB);
            for (int i = 0; i <result.length ; i++) {
                for (int j = 0; j <result.length ; j++) {
                    int rgb=result[i][j]<<16|result[i][j]<<8|result[i][j];
                    convertImage.setRGB(i,j,rgb);
                }
            }
            //frame to show image
            JFrame frame=new JFrame();
            frame.getContentPane().setLayout(new FlowLayout());
            frame.getContentPane().add(new JLabel(new ImageIcon(image)));
            frame.getContentPane().add(new JLabel(new ImageIcon(convertImage)));

            frame.pack();
            frame.setVisible(true);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private static void display(int[][] result) {
        for (int i = 0; i <result.length ; i++) {
            for (int j = 0; j <result.length ; j++) {
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static void rotateby90(int[][] matrix) {
        int N=matrix.length;
        //no. of cycle
        for(int i=0;i<N/2;i++){
            //elements to swap in each cycle;
            for(int j=i;j<N-i-1;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[N-j-1][i];
                matrix[N-j-1][i]=matrix[N-i-1][N-j-1];
                matrix[N-i-1][N-j-1]=matrix[j][N-i-1];
                matrix[j][N-i-1]=temp;
            }
        }
    }

    private static int[][] convertTo2D(BufferedImage image) {
        int width=image.getWidth();
        int height=image.getHeight();
        int[][] result=new int[height][width];
        for (int row = 0; row < height; row++) {
            for (int col = 0; col <width ; col++) {
                result[row][col]=image.getRGB(row,col);
            }
        }
        return result;
    }
}
