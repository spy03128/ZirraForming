import { motion } from "framer-motion";
import styled from "styled-components";
import { BasicButton } from "../../items/Button";

const Wrapper = styled(motion.div)`
	position: relative;
	top: 15vh;
	display: flex;
	flex-direction: column;
	align-items: center;
	background-color: white;
	opacity: 0.7;
	border-radius: 5vh;
	width: 32vw;
	height: 75vh;

	h2 {
		font-size: 100;
		color: black;
	}
`;

const Title = styled(motion.h1)`
	font-size: min(6vw, 80px);
	text-align: center;
	font-weight: 400;
	white-space: nowrap;
`;

const TitleWrap = styled(motion.div)`
	display: grid;
	grid-template-rows: 1fr 3fr;
	grid-template-columns: 1fr;
	width: 100%;
	height: 100%;
	padding: 40px 30px 5px;

	.title__top {
		font-size: min(4vw, 40px);
		color: #fbc531;
		text-align: center;
		align-self: end;
	}

	.title__main {
		align-self: start;
		color: #3c9f58;
		text-align: center;
		line-height: min(18vw, 150px);
		font-size: min(18vw, 150px);
	}
`;

const Content = styled(motion.div)`
	font-size: min(3vw, 30px);
	text-align: center;
	word-break: keep-all;
`;

const ButtonWrap = styled(motion.div)`
	justify-self: center;
	display: flex;
	width: min(80vw, 800px);
	height: 100%;
	align-items: center;
	justify-content: space-evenly;
`;

function Intro() {
	return (
		<>
			<Wrapper>
				<h2>캐릭터로 알아보는 나의 환경 스타일은?</h2>
				<img
					src="/assets/styleQuiz/문제0.png"
					style={{ width: "60%" }}
					alt=""
				/>
			</Wrapper>
		</>
	);
}

export default Intro;
