package com.bryanrady.design.facaed;

import com.bryanrady.design.facaed.children.Cpu;
import com.bryanrady.design.facaed.children.Disk;
import com.bryanrady.design.facaed.children.Memory;

/**
 *  外观模式（面模式）门的核心  把里面的实现包装起来 只暴露Computer给客户端使用
 * Created by wangqingbin on 2019/1/3.
 */

public class Computer {

    private Cpu cpu;
    private Memory memory;
    private Disk disk;

    public Computer(){
        this.cpu = new Cpu();
        this.memory = new Memory();
        this.disk = new Disk();
    }

    public void start(){
        cpu.start();
        memory.start();
        disk.start();
    }

    public void shutdown(){
        cpu.shutdown();
        memory.shutdown();
        disk.shutdown();
    }
}
