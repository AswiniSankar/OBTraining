package com.corejava.assignments;
class CPU{
  private class Processor{
		int speed= 2000;
		void processorFunction() {
			System.out.println("Speed is:"+speed);
		}
	}
	private class Memory{
		int storage=128;
		void memoryFunction() {
			System.out.println("storage:"+storage);
		}
	}
	void function() {
	
		Processor processor = new Processor();
		processor.processorFunction();
		Memory memory = new Memory();
		memory.memoryFunction();
	}
}
public class CPUInNestedClass {

	public static void main(String[] args) {
      CPU cpu = new CPU();
      cpu.function();
	}

	

}
