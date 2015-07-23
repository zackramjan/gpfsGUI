package com.zaxxis.gpfs.shared;

import com.sencha.gxt.core.client.ValueProvider;

public class TableDataValueProvider implements ValueProvider<TableData,String>
{
	private Integer index;
	public TableDataValueProvider(int index)
	{
		this.index = index;
	}
	
	@Override
	public String getValue(TableData object) {
		return object.get(index);
	}

	@Override
	public void setValue(TableData object, String value) {
		object.set(index, value);
	}

	@Override
	public String getPath() {
		return index.toString();
	}
}
