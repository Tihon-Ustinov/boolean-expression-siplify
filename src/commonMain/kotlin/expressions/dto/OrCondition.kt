package expressions.dto

class OrCondition(vararg conditions: Any) : AbstractCondition(*conditions) {

    override fun getAllCandidates() = conditions.flatMap { it.getAllCandidates() }

    override fun isSatisfied() = this.conditions.any { it.isSatisfied() }

    override fun toString() = conditions.joinToString(" || ", "(", ")")
}