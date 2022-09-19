import styled from "styled-components";
import Result from "../components/mbti/Result";

const CanvasWrap = styled.div`
	width: 100%;
	height: auto;

	color: ${(props) => props.theme.lightWhite};
	font-family: "Black Han Sans";
	display: flex;
	justify-content: center;
`;
function MbtiResult() {
	return (
		<CanvasWrap>
			<Result />
		</CanvasWrap>
	);
}
export default MbtiResult;
