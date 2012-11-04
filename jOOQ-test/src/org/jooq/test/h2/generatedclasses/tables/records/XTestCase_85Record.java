/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class XTestCase_85Record extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.h2.generatedclasses.tables.records.XTestCase_85Record> implements org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.String>, org.jooq.test.h2.generatedclasses.tables.interfaces.IXTestCase_85 {

	private static final long serialVersionUID = 2118767500;

	/**
	 * The table column <code>PUBLIC.X_TEST_CASE_85.ID</code>
	 */
	@Override
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.h2.generatedclasses.tables.XTestCase_85.ID, value);
	}

	/**
	 * The table column <code>PUBLIC.X_TEST_CASE_85.ID</code>
	 */
	@Override
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.h2.generatedclasses.tables.XTestCase_85.ID);
	}

	/**
	 * The table column <code>PUBLIC.X_TEST_CASE_85.X_UNUSED_ID</code>
	 */
	@Override
	public void setXUnusedId(java.lang.Integer value) {
		setValue(org.jooq.test.h2.generatedclasses.tables.XTestCase_85.X_UNUSED_ID, value);
	}

	/**
	 * The table column <code>PUBLIC.X_TEST_CASE_85.X_UNUSED_ID</code>
	 */
	@Override
	public java.lang.Integer getXUnusedId() {
		return getValue(org.jooq.test.h2.generatedclasses.tables.XTestCase_85.X_UNUSED_ID);
	}

	/**
	 * The table column <code>PUBLIC.X_TEST_CASE_85.X_UNUSED_NAME</code>
	 */
	@Override
	public void setXUnusedName(java.lang.String value) {
		setValue(org.jooq.test.h2.generatedclasses.tables.XTestCase_85.X_UNUSED_NAME, value);
	}

	/**
	 * The table column <code>PUBLIC.X_TEST_CASE_85.X_UNUSED_NAME</code>
	 */
	@Override
	public java.lang.String getXUnusedName() {
		return getValue(org.jooq.test.h2.generatedclasses.tables.XTestCase_85.X_UNUSED_NAME);
	}

	/**
	 * Create a detached XTestCase_85Record
	 */
	public XTestCase_85Record() {
		super(org.jooq.test.h2.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85);
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.String> fieldsRow() {
		return org.jooq.impl.Factory.row(field1(), field2(), field3());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.String> valuesRow() {
		return org.jooq.impl.Factory.row(value1(), value2(), value3());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.h2.generatedclasses.tables.XTestCase_85.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return org.jooq.test.h2.generatedclasses.tables.XTestCase_85.X_UNUSED_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return org.jooq.test.h2.generatedclasses.tables.XTestCase_85.X_UNUSED_NAME;
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
	public java.lang.Integer value2() {
		return getXUnusedId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getXUnusedName();
	}
}
