/**
 * This class is generated by jOOQ
 */
package org.jooq.test.jdbcoracle.generatedclasses.test.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class XTestCase_71Record extends org.jooq.impl.TableRecordImpl<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.XTestCase_71Record> implements org.jooq.Record2<java.lang.Integer, java.lang.Short>, org.jooq.test.jdbcoracle.generatedclasses.test.tables.interfaces.IXTestCase_71 {

	private static final long serialVersionUID = -951421318;

	/**
	 * Setter for <code>TEST.X_TEST_CASE_71.ID</code>. 
	 */
	@Override
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>TEST.X_TEST_CASE_71.ID</code>. 
	 */
	@Override
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>TEST.X_TEST_CASE_71.TEST_CASE_64_69_ID</code>. 
	 */
	@Override
	public void setTestCase_64_69Id(java.lang.Short value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>TEST.X_TEST_CASE_71.TEST_CASE_64_69_ID</code>. 
	 */
	@Override
	public java.lang.Short getTestCase_64_69Id() {
		return (java.lang.Short) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.lang.Short> fieldsRow() {
		return (org.jooq.Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.lang.Short> valuesRow() {
		return (org.jooq.Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.jdbcoracle.generatedclasses.test.tables.XTestCase_71.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Short> field2() {
		return org.jooq.test.jdbcoracle.generatedclasses.test.tables.XTestCase_71.TEST_CASE_64_69_ID;
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
	public java.lang.Short value2() {
		return getTestCase_64_69Id();
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.test.jdbcoracle.generatedclasses.test.tables.interfaces.IXTestCase_71 from) {
		setId(from.getId());
		setTestCase_64_69Id(from.getTestCase_64_69Id());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.jdbcoracle.generatedclasses.test.tables.interfaces.IXTestCase_71> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached XTestCase_71Record
	 */
	public XTestCase_71Record() {
		super(org.jooq.test.jdbcoracle.generatedclasses.test.tables.XTestCase_71.X_TEST_CASE_71);
	}
}