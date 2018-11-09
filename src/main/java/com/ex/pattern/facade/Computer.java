package com.ex.pattern.facade;

/**
 * 外观类：将cpu/disk/memory 统一处理
 * @Author qiangl
 * Created by qgl on 2018/11/4.
 */
public class Computer {

    private CPU cpu;
    private Disk disk;
    private Memory memory;

    public Computer(){
        cpu = new CPU();
        memory = new Memory();
        disk = new Disk();
    }

    public void startup(){
        System.out.println("start the computer");
        cpu.startup();
        memory.startup();
        disk.startup();
        System.out.println("start computer finished");
    }

    public void shutdown(){
        System.out.println("begin to close the computer!");
        cpu.shutdown();
        memory.shutdown();
        disk.shutdown();
        System.out.println("computer closed!");
    }

}
