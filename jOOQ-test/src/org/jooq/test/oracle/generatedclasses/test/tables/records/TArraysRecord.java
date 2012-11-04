/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "T_ARRAYS", schema = "TEST")
public class TArraysRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.oracle.generatedclasses.test.tables.records.TArraysRecord> implements org.jooq.Record5<java.lang.Integer, org.jooq.test.oracle.generatedclasses.test.udt.records.UStringArrayRecord, org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberArrayRecord, org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberLongArrayRecord, org.jooq.test.oracle.generatedclasses.test.udt.records.UDateArrayRecord> {

	private static final long serialVersionUID = -334456943;

	/**
	 * The table column <code>TEST.T_ARRAYS.ID</code>
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.TArrays.T_ARRAYS.ID, value);
	}

	/**
	 * The table column <code>TEST.T_ARRAYS.ID</code>
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true, nullable = false, precision = 7)
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.TArrays.T_ARRAYS.ID);
	}

	/**
	 * The table column <code>TEST.T_ARRAYS.STRING_ARRAY</code>
	 */
	public void setStringArray(org.jooq.test.oracle.generatedclasses.test.udt.records.UStringArrayRecord value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.TArrays.T_ARRAYS.STRING_ARRAY, value);
	}

	/**
	 * The table column <code>TEST.T_ARRAYS.STRING_ARRAY</code>
	 */
	@javax.persistence.Column(name = "STRING_ARRAY", length = 101)
	public org.jooq.test.oracle.generatedclasses.test.udt.records.UStringArrayRecord getStringArray() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.TArrays.T_ARRAYS.STRING_ARRAY);
	}

	/**
	 * The table column <code>TEST.T_ARRAYS.NUMBER_ARRAY</code>
	 */
	public void setNumberArray(org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberArrayRecord value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.TArrays.T_ARRAYS.NUMBER_ARRAY, value);
	}

	/**
	 * The table column <code>TEST.T_ARRAYS.NUMBER_ARRAY</code>
	 */
	@javax.persistence.Column(name = "NUMBER_ARRAY", length = 109)
	public org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberArrayRecord getNumberArray() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.TArrays.T_ARRAYS.NUMBER_ARRAY);
	}

	/**
	 * The table column <code>TEST.T_ARRAYS.NUMBER_LONG_ARRAY</code>
	 */
	public void setNumberLongArray(org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberLongArrayRecord value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.TArrays.T_ARRAYS.NUMBER_LONG_ARRAY, value);
	}

	/**
	 * The table column <code>TEST.T_ARRAYS.NUMBER_LONG_ARRAY</code>
	 */
	@javax.persistence.Column(name = "NUMBER_LONG_ARRAY", length = 109)
	public org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberLongArrayRecord getNumberLongArray() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.TArrays.T_ARRAYS.NUMBER_LONG_ARRAY);
	}

	/**
	 * The table column <code>TEST.T_ARRAYS.DATE_ARRAY</code>
	 */
	public void setDateArray(org.jooq.test.oracle.generatedclasses.test.udt.records.UDateArrayRecord value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.TArrays.T_ARRAYS.DATE_ARRAY, value);
	}

	/**
	 * The table column <code>TEST.T_ARRAYS.DATE_ARRAY</code>
	 */
	@javax.persistence.Column(name = "DATE_ARRAY", length = 49)
	public org.jooq.test.oracle.generatedclasses.test.udt.records.UDateArrayRecord getDateArray() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.TArrays.T_ARRAYS.DATE_ARRAY);
	}

	/**
	 * Create a detached TArraysRecord
	 */
	public TArraysRecord() {
		super(org.jooq.test.oracle.generatedclasses.test.tables.TArrays.T_ARRAYS);
	}

	// -------------------------------------------------------------------------
	// Record5 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row5<java.lang.Integer, org.jooq.test.oracle.generatedclasses.test.udt.records.UStringArrayRecord, org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberArrayRecord, org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberLongArrayRecord, org.jooq.test.oracle.generatedclasses.test.udt.records.UDateArrayRecord> fieldsRow() {
		return org.jooq.impl.Factory.row(field1(), field2(), field3(), field4(), field5());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row5<java.lang.Integer, org.jooq.test.oracle.generatedclasses.test.udt.records.UStringArrayRecord, org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberArrayRecord, org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberLongArrayRecord, org.jooq.test.oracle.generatedclasses.test.udt.records.UDateArrayRecord> valuesRow() {
		return org.jooq.impl.Factory.row(value1(), value2(), value3(), value4(), value5());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.oracle.generatedclasses.test.tables.TArrays.T_ARRAYS.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.test.oracle.generatedclasses.test.udt.records.UStringArrayRecord> field2() {
		return org.jooq.test.oracle.generatedclasses.test.tables.TArrays.T_ARRAYS.STRING_ARRAY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberArrayRecord> field3() {
		return org.jooq.test.oracle.generatedclasses.test.tables.TArrays.T_ARRAYS.NUMBER_ARRAY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberLongArrayRecord> field4() {
		return org.jooq.test.oracle.generatedclasses.test.tables.TArrays.T_ARRAYS.NUMBER_LONG_ARRAY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.test.oracle.generatedclasses.test.udt.records.UDateArrayRecord> field5() {
		return org.jooq.test.oracle.generatedclasses.test.tables.TArrays.T_ARRAYS.DATE_ARRAY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.oracle.generatedclasses.test.udt.records.UStringArrayRecord value2() {
		return getStringArray();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberArrayRecord value3() {
		return getNumberArray();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberLongArrayRecord value4() {
		return getNumberLongArray();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.oracle.generatedclasses.test.udt.records.UDateArrayRecord value5() {
		return getDateArray();
	}
}
