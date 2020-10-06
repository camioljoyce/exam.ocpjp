package exam.ocpjp.v1.q040;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(1,2,3);
		values.stream().map(n->n*2).peek(System.out::print).count();
		
//		stream的生命周期有三個階段
//
//		起始生成階段。
//		中間操作會逐一獲取元素並進行處理。 可有可無。所有中間操作都是惰性的，因此，stream在管道中流動之前，任何操作都不會產生任何影響。
//		終端操作。通常分為 最終的消費 （foreach 之類的）和 歸納 （collect）兩類。還有重要的一點就是終端操作啟動了stream在管道中的流動。
	}

}
