/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resource;

import domain.Fornecedor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TnahLenovoNote01
 */
public class FornecedorTableModel extends GenericTableModel<Fornecedor> {

    private final String[] colunas = {"Código", "Nome", "Nome fantasia"};

    private List<Fornecedor> list;

    private FornecedorTableModel() {
        list = new ArrayList<>();
    }

    public FornecedorTableModel(List<Fornecedor> list) {
        this();
        setData(list);
    }

    @Override
    public void add(Fornecedor entity) {
        list.add(0, entity);
        super.fireTableDataChanged();
    }

    @Override
    public void clear() {
        this.list.clear();
        super.fireTableDataChanged();
    }

    @Override
    public boolean contains(Fornecedor entity) {
        return list.contains(entity);
    }

    @Override
    public Fornecedor getValueAT(int row) {
        return list.get(row);
    }

    @Override
    public int indexOf(Fornecedor entity) {
        return list.indexOf(entity);
    }

    @Override
    public List<Fornecedor> list() {
        return list;
    }

    @Override
    public void remove(Fornecedor entity) {
        list.remove(entity);
        super.fireTableDataChanged();
    }

    @Override
    public void setData(List<Fornecedor> list) {
        this.list.clear();
        this.list.addAll(list);
        super.fireTableDataChanged();
    }

    @Override
    public void updateItem(int idx, Fornecedor entity) {
        list.set(idx, entity);
        super.fireTableDataChanged();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        Fornecedor fornecedor = list.get(linha);
        switch (coluna) {
            case 0:
                return fornecedor.getId_fornecedor();
            case 1:
                return fornecedor.getNome();
            case 2:
                return fornecedor.getNome_fantasia();

        }
        return null;
    }

    @Override
    public String getColumnName(int col) {
        return colunas[col];
    }

    public String[] getColumnNames() {
        return colunas;
    }
}
