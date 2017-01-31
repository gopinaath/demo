<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html lang="en">

<jsp:include page="../fragments/header.jsp" />

<spring:url value="/healthinfo" var="previous" />
<spring:url value="/" var="next" />
<spring:url value="/incomeinfo" var="userActionUrl" />

<div class="container">

	<h1>
		<spring:message code="incomeInformation" />
	</h1>
	<br />

	<form:form class="form-horizontal" method="post"
		modelAttribute="incomeForm" action="${userActionUrl}">

		<div class="row">
			<label><spring:message code="incomeQuestion1" /></label>
		</div>

		<div class="row">
			<form:radiobuttons path="questionOne" items="${paySourceList}"
				element="label class='radio-inline'" />
		</div>

		<div class="row">
			<spring:bind path="questionTwo">
				<div class="form-group ${status.error ? 'has-error' : ''}">

					<div class="col-sm-5">

						<form:errors path="questionTwo" class="control-label" />
					</div>
				</div>
			</spring:bind>
		</div>

		<div class="row">
			<label><spring:message code="incomeQuestion2" /></label>
		</div>

		<div class="row">
			<div class="col-sm-5">
				<form:select path="questionTwo" class="col-sm-5 form-control">
					<form:option value="NONE" label="--- Select ---" />
					<form:options items="${incomeSourceList}" />
				</form:select>
			</div>
			<div class="col-sm-5"></div>
		</div>

		<div class="row">
			<label><spring:message code="incomeQuestion3" /></label>
		</div>

		<div class="row">
			<form:radiobuttons path="questionThree" items="${incomeGrowthList}"
				element="label class='radio-inline'" />
		</div>

		<div class="row">
			<label><spring:message code="incomeQuestion4" /></label>
		</div>

		<div class="row">
			<form:radiobuttons path="questionFour" items="${assetsChangeList}"
				element="label class='radio-inline'" />
		</div>

		<div class="form-group">
			<div class="col-sm-9">
				<a class="btn btn-primary" href="${previous}" role="button">Previous</a>
				<button type="submit" class="btn btn-primary pull-right">Finish</button>
			</div>
		</div>

	</form:form>

</div>

<jsp:include page="../fragments/footer.jsp" />

</body>
</html>