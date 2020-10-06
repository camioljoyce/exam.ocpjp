package exam.ocpjp.v1.q055;

public class Test {

	public static void main(String[] args) {
//		Which statement is true about java.util.stream.Stream?
//
//		A. A stream cannot be consumed more than once.
//		B. The execution mode of streams can be changed during processing.
//		C. Streams are intended to modify the source data.
//		D. A parallel stream is always faster than an equivalent sequential stream.
//
//		題解
//		選項A，串流是可以被消耗很多次的，例如使用peak方法。
//
//		選項B，這個選項應該是指串流的序列處理模式和平行化處理模式。
//
//		選項C，串流並不會修改到原始的資料，而是產生新的資料出來。
//
//		選項D，平行化的串流並不總是比序列的串流快，因為多執行緒會需要消耗額外的資源。
		System.out.println("B");
	}

}
