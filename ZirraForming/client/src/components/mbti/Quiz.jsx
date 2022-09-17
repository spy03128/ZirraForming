import { motion } from "framer-motion";
import styled from "styled-components";
import { BasicButton } from "../../items/styleButton";
import { useState } from "react";

const Wrapper = styled(motion.div)`
	position: relative;
	top: 15vh;
	display: flex;
	flex-direction: column;
	align-items: center;
	background-color: white;
	opacity: 1;
	border-radius: 5vh;
	width: 32vw;
	height: 75vh;

	h2 {
		font-size: 100;
		color: black;
	}
`;

function Quiz() {
	const [index, setIndex] = useState(0);
	return (
		<>
			<Wrapper>
				<div
					style={{
						width: "80%",
						height: "20px",
						backgroundColor: "#9ba3eb",
						margin: "7vh 0px 3vh 0px",
					}}
				></div>
				<img
					src="/assets/styleQuiz/bar.png"
					style={{
						width: "70px",
						left: 50 * 1,
						margin: "4vh 0 2vh 0 ",
						position: "absolute",
					}}
					alt=""
				/>
				<h2>커피를 마시기 위해 카페에 방문한 나는</h2>
				<img
					src="/assets/styleQuiz/문제1.png"
					style={{ width: "40%", margin: "3vh 0 2vh 0 " }}
					alt=""
				/>
				<BasicButton
					style={{ marginBottom: "3vh", fontSize: "20px" }}
					onClick={() => {}}
				>
					가게에서 주는 일회용컵에 담아간다.
				</BasicButton>
				<BasicButton style={{ fontSize: "20px" }} onClick={() => {}}>
					"이럴줄 알고 준비했지"라며 <br /> 개인 텀블러에 담아간다.
				</BasicButton>
			</Wrapper>
		</>
	);
}

export default Quiz;
