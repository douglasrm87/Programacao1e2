package programacao2.aula09.swing.aovivo;

import java.util.List;

import javax.swing.table.AbstractTableModel;

public class ModeloTabela extends AbstractTableModel {

	List<ContaCorrente> cc;

	public ModeloTabela(List<ContaCorrente> cc) {
		super();
		this.cc = cc;
	}

	@Override
	public int getColumnCount() {
		return 4;
	}

	@Override
	public int getRowCount() {
		return this.cc.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		ContaCorrente n = this.cc.get(rowIndex);
		switch (columnIndex) {
		case 0:
			return n.getAgencia();
		case 1:
			return n.getConta();
		case 2:
			return n.getNomeCliente();
		case 3:
			return n.getSaldo();
		}
		return null;
	}
}
