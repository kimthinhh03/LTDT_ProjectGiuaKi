package ProjectGK;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class DirGraph extends Graph {

	public DirGraph(String path) {
		super(path);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addEdges(int i, int j) {
		// TODO Auto-generated method stub
		if ((i >= 0 && j >= 0) && (i < numVexs && j < numVexs)) {
			matrix[i][j]++;
		} else {
			System.out.println("dinh khong ton tai");
		}
	}

	@Override
	public void removeEdges(int i, int j) {
		if ((i >= 0 && j >= 0) && (i < numVexs && j < numVexs)) {
			if (matrix[i][j] > 0) {
				matrix[i][j]--;
			} else {
				System.out.println("khong co canh de xoa");
			}
		} else {
			System.out.println("nhap dinh khong ton tai");
		}
	}

	public static void main(String[] args) {
		String pathFile = "C:\\Users\\Admin\\eclipse-workspace\\LTDT\\src\\ProjectGK\\MTK_DirGraph1";
		Graph dg1 = new DirGraph(pathFile);
		dg1.loadGraph(pathFile);
		dg1.printMatrix();
		
		dg1.addEdges(0, 0);
		dg1.printMatrix();
		dg1.removeEdges(1, 1);
		dg1.removeEdges(3, 4);
		dg1.printMatrix();
		System.out.println();
		dg1.addVex(5);
		
		System.out.println(Arrays.toString(dg1.BFS_Trung(0)));
		System.out.println(dg1.isConnected(dg1.matrix));

	}

	@Override
	public void addVex(int v) {
		int[][] matrixAfterAddVex = new int[matrix.length + 1][matrix.length + 1];
		boolean exitVex = false;
		for (int i = 0; i < numVexs; i++) {
			if (v == i)
				exitVex = true;
		}
		if (exitVex == true) {
			System.out.println("dinh da ton tai");
		} else {
			for (int i = 0; i < matrixAfterAddVex.length; i++) {

			}
			for (int i = 0; i < matrixAfterAddVex.length; i++) {
				for (int j = 0; j < matrixAfterAddVex[0].length; j++) {
					if (i < matrix.length && j < matrix.length) {
						System.out.print(matrix[i][j] + " ");
					} else {
						System.out.print(matrixAfterAddVex[i][j] + " ");
					}
				}
				System.out.println();
			}

		}
	}
}
