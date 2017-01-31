<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html lang="en">

<jsp:include page="../fragments/header.jsp" />

<spring:url value="/contactinfo" var="previous" />
<spring:url value="/incomeinfo" var="next" />
<spring:url value="/healthinfo" var="userActionUrl" />

<div class="container">

	<h1>
		<spring:message code="healthInformation" />
	</h1>
	<br />

	<form:form class="form-horizontal" method="post"
		modelAttribute="healthInfo" action="${userActionUrl}">

		<div class="row">
			<label><spring:message code="healthQuestion1" /></label>
		</div>

		<div class="row">
			<form:radiobuttons path="" items="${yesOrNoList}"
				element="label class='radio-inline'" />
		</div>

		<div class="row">
			<label><spring:message code="healthQuestion2" /></label>
		</div>

		<div class="row">
			<form:radiobuttons path="" items="${yesOrNoList}"
				element="label class='radio-inline'" />
		</div>

		<div class="row">
			<label><spring:message code="healthQuestion3" /></label>
		</div>

		<div class="row">
			<form:radiobuttons path="" items="${yesOrNoList}"
				element="label class='radio-inline'" />
		</div>

		<div class="row">
			<label><spring:message code="healthQuestion4" /></label>
		</div>

		<div class="row">
			<form:radiobuttons path="" items="${yesOrNoList}"
				element="label class='radio-inline'" />
		</div>

		<div class="row">
			<label><spring:message code="healthQuestion5" /></label>
		</div>

		<div class="row">
			<form:radiobuttons path="" items="${yesOrNoList}"
				element="label class='radio-inline'" />
		</div>

		<div class="form-group">
			<div class="col-sm-9">
				<a class="btn btn-primary" href="${previous}" role="button">Previous</a>
				<button type="submit" class="btn btn-primary pull-right">Next</button>
			</div>
		</div>
	</form:form>



</div>

<jsp:include page="../fragments/footer.jsp" />

</body>
</html>