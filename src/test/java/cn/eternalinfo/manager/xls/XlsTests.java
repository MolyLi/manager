package cn.eternalinfo.manager.xls;

import java.util.List;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class XlsTests extends XxlsAbstract {

	private Logger logger = LoggerFactory.getLogger(getClass());

	private String inputFileName = "C:\\Users\\LiXiaolan\\Desktop\\test.xlsx";

	@Override
	public void optRows(int sheetIndex, int curRow, List<String> rowlist) {
		for (int i = 0; i < rowlist.size(); i++) {
			System.out.print("'" + rowlist.get(i) + "',");
		}
		System.out.println();
	}

	@Test
	public void runTest() {
		try {
			long start = System.currentTimeMillis();
			process(inputFileName);
			long end = System.currentTimeMillis();
			logger.debug("执行完成,耗时{} ms", end - start);
		} catch (Exception e) {
			logger.error("执行异常", e);
		}
	}
}
