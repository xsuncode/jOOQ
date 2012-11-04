/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "t_725_lob_test", schema = "public")
public class T_725LobTestRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.postgres.generatedclasses.tables.records.T_725LobTestRecord> implements org.jooq.Record2<java.lang.Integer, byte[]> {

	private static final long serialVersionUID = -1726496938;

	/**
	 * The table column <code>public.t_725_lob_test.id</code>
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.T_725LobTest.T_725_LOB_TEST.ID, value);
	}

	/**
	 * The table column <code>public.t_725_lob_test.id</code>
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 32)
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.T_725LobTest.T_725_LOB_TEST.ID);
	}

	/**
	 * The table column <code>public.t_725_lob_test.lob</code>
	 */
	public void setLob(byte[] value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.T_725LobTest.T_725_LOB_TEST.LOB, value);
	}

	/**
	 * The table column <code>public.t_725_lob_test.lob</code>
	 */
	@javax.persistence.Column(name = "lob")
	public byte[] getLob() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.T_725LobTest.T_725_LOB_TEST.LOB);
	}

	/**
	 * Create a detached T_725LobTestRecord
	 */
	public T_725LobTestRecord() {
		super(org.jooq.test.postgres.generatedclasses.tables.T_725LobTest.T_725_LOB_TEST);
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, byte[]> fieldsRow() {
		return org.jooq.impl.Factory.row(field1(), field2());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, byte[]> valuesRow() {
		return org.jooq.impl.Factory.row(value1(), value2());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.postgres.generatedclasses.tables.T_725LobTest.T_725_LOB_TEST.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<byte[]> field2() {
		return org.jooq.test.postgres.generatedclasses.tables.T_725LobTest.T_725_LOB_TEST.LOB;
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
	public byte[] value2() {
		return getLob();
	}
}
